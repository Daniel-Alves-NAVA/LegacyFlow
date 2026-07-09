# Skill: backup-local-doc-memory

## Objetivo

Auxiliar na criação, descrição, exportação e restauração de pacotes de backup da memória local de documentação.

## Quando Usar

Use quando o usuário pedir para:

- fazer backup da memória local;
- exportar contexto local;
- restaurar contexto local;
- trocar de máquina;
- limpar o projeto sem perder histórico;
- preservar summaries, memory e runs.

## Diretório de Origem

```text
.legacy-doc-agent/
```

## Diretório de Backup

```text
.legacy-doc-agent/backups/
```

## Nome Sugerido do Pacote

```text
<project-name>-doc-memory-<timestamp>.zip
```

## Conteúdo do Backup

O pacote deve conter:

- memory/
- summaries/
- runs/
- manifest.json
- README.restore.md

## Manifesto do Backup

```json
{
  "projectName": "<project-name>",
  "createdAt": "<timestamp>",
  "legacyDocKitVersion": "1.0.0",
  "sourcePath": ".legacy-doc-agent",
  "containsSecrets": false,
  "includedFolders": [
    "memory",
    "summaries",
    "runs"
  ],
  "notes": []
}
```

## Regras

- Não incluir secrets.
- Não incluir credenciais.
- Não incluir arquivos .env.
- Não incluir arquivos de configuração com senhas.
- Gerar README de restauração.
- Validar se o backup parece compatível antes de restaurar.
- Manter backup local por padrão.
- Não enviar backup para repositório remoto.
