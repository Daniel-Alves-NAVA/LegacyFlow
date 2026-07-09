# Legacy Doc Kit

Kit de documentação para sistemas legados, pensado para funcionar com GitHub Copilot de forma mais consistente, rastreável e alinhada ao código.

## O que é este projeto

Este repositório reúne:

- agentes especializados para gerar documentação técnica e de negócio;
- skills reutilizáveis para análise de fluxos Java/Spring;
- prompts, templates e instruções para padronizar a saída;
- um fluxo de revisão que ajuda a reduzir alucinações e melhorar a qualidade.

O objetivo é transformar código legado em documentação útil, com evidências claras e diagramas em Mermaid.

## Por que usar

- acelera a documentação de fluxos complexos;
- reduz retrabalho e inconsistência entre pessoas;
- melhora a rastreabilidade entre código e documentação;
- facilita a compreensão de sistemas legados por novos integrantes.

## Instalação

Na raiz do projeto, execute:

```bash
./gradlew installGuidelines
```

O diretório padrão de instalação é:

```text
~/.company/copilot-guidelines
```

Para definir outro destino:

```bash
./gradlew installGuidelines -PcopilotGuidelinesDir=/caminho/customizado
```

## Uso rápido no Copilot

Após instalar, use o Copilot com prompts como:

```text
Documente este fluxo seguindo as guidelines do Legacy Doc Kit.
```

Ou, se quiser uma abordagem mais estruturada:

```text
Use o agente legacy-documentation-agent para documentar este listener e depois revise com o legacy-documentation-reviewer-agent.
```

## Agentes disponíveis

- legacy-documentation-agent: gera documentação técnica e de negócio a partir do código.
- legacy-documentation-reviewer-agent: revisa a documentação, valida evidências e aponta riscos de alucinação.

## Skills principais

- document-java-spring-flow
- document-sequence-flow
- document-business-flow
- review-generated-doc
- estimate-doc-token-cost
- maintain-project-doc-context
- backup-local-doc-memory

## Memória local

O projeto pode usar uma memória local por repositório, armazenada em:

```text
.legacy-doc-agent/
```

Essa pasta deve ficar fora do controle de versão. No projeto analisado, recomenda-se adicionar ao .gitignore:

```text
.legacy-doc-agent/
```

## Fluxo recomendado

1. Abra os arquivos relevantes no editor.
2. Selecione o fluxo que deseja documentar.
3. Gere a documentação com o agente apropriado.
4. Revise a saída antes de considerar finalizada.
5. Atualize a memória local se houver contexto importante.
6. Faça backup da memória ao trocar de máquina ou compartilhar contexto.

## Comandos slash

Os comandos abaixo podem ajudar no uso diário no chat do Copilot:

- /generate-legacy-flow
- /review-legacy-doc
- /estimate-context-cost
- /update-local-memory
- /backup-local-memory

## Estrutura do repositório

- agents: definição dos agentes.
- skills: capacidades reutilizáveis.
- prompts: instruções prontas para uso.
- templates: modelos de saída em Markdown.
- workflows: fluxo de orquestração e gates de revisão.
- fixtures: exemplos e cenários de validação.

## Boas práticas

- documente um fluxo por vez;
- use evidências do código, não suposições;
- revise sempre a saída antes de compartilhar;
- mantenha o contexto local sempre organizado;
- prefira explicações objetivas e rastreáveis.
