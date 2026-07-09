plugins {
    base
}

val installDir = providers.gradleProperty("copilotGuidelinesDir")
    .orElse("${System.getProperty("user.home")}/.company/copilot-guidelines")

tasks.register("installGuidelines") {

    group = "copilot-guidelines"

    description = "Instala agents, skills, templates, instructions, prompts e language profiles em diretório global."

    doLast {

        val target = file(installDir.get())

        val folders = listOf(

            "agents",

            "skills",

            "templates",

            "instructions",

            "prompts",

            "language-profiles"

        )

        folders.forEach { folder ->

            val sourceDir = file(folder)

            val targetDir = file("${target.absolutePath}/$folder")

            if (sourceDir.exists()) {

                sourceDir.copyRecursively(targetDir, overwrite = true)

                println("Copied $folder to ${targetDir.absolutePath}")

            } else {

                println("Skipped missing folder: $folder")

            }

        }

        println("Guidelines installed at: ${target.absolutePath}")

    }

}

tasks.register("uninstallGuidelines") {

    group = "copilot-guidelines"

    description = "Remove instalação global das guidelines."

    doLast {

        val target = file(installDir.get())

        if (target.exists()) {

            target.deleteRecursively()

            println("Removed: ${target.absolutePath}")

        } else {

            println("Nothing to remove at: ${target.absolutePath}")

        }

    }

}

tasks.register("printGuidelinesDir") {

    group = "copilot-guidelines"

    description = "Mostra o diretório de instalação das guidelines."

    doLast {

        println(installDir.get())

    }

}
