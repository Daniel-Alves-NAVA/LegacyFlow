# Legacy Doc Kit

Legacy Documentation Kit for Copilot.

Este repositório contém agents, skills, prompts, templates, instructions e language profiles para auxiliar na documentação de sistemas legados usando GitHub Copilot.

## Objetivo

Padronizar a geração de documentação técnica e de negócio a partir do código-fonte, usando Markdown e Mermaid.

## Instalação

```bash
./gradlew installGuidelines
```

Diretório padrão:

~/.company/copilot-guidelines

Para alterar:

```bash
./gradlew installGuidelines -PcopilotGuidelinesDir=/caminho/customizado
```

## Uso no Copilot

Exemplo:

Use o legacy-documentation-agent e a skill document-java-spring-flow para documentar o fluxo iniciado por esta classe.

Ou:

Documente esse listener seguindo as guidelines corporativas de documentação legado.

## Skills Disponíveis

| Skill | Objetivo |
|---|---|
| document-java-spring-flow | Documenta fluxos Java/Spring considerando código e configurações |
| document-sequence-flow | Gera documentação técnica com Mermaid sequenceDiagram |
| document-business-flow | Gera fluxo de negócio com Mermaid flowchart |
| review-generated-doc | Revisa documentação gerada |
| estimate-doc-token-cost | Estima tamanho/custo do contexto |
| maintain-project-doc-context | Mantém memória local do projeto |
| backup-local-doc-memory | Auxilia backup e restauração da memória local |

## Memória Local

Este projeto prevê uma memória local criada dentro do repositório analisado:

.legacy-doc-agent/

Essa pasta deve ficar fora do Git.

Adicione ao .gitignore do projeto analisado:

```text
.legacy-doc-agent/
```

## Boas Práticas

- Documente um fluxo por vez.
- Abra no IDE os arquivos relacionados ao fluxo.
- Não peça para documentar o repositório inteiro.
- Revise sempre a documentação antes de commitar.
- Confirme tópicos, filas, endpoints e clients externos.
- Use a skill de revisão antes de finalizar.
- Use memória local para reduzir contexto.
- Faça backup da memória local quando trocar de máquina.
