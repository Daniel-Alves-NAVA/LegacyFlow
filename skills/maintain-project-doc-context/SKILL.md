# Skill: maintain-project-doc-context

## Objetivo

Criar, atualizar e consultar a memória local de documentação do projeto.

A memória local deve ajudar a reduzir consumo de tokens, reaproveitar conhecimento já extraído e manter contexto entre execuções.

## Diretório Esperado

```text
.legacy-doc-agent/
  memory/
  summaries/
  runs/
  backups/
  manifest.json
```

## Quando Usar

Use esta skill quando o usuário pedir para:

- iniciar memória local do projeto;
- atualizar contexto do projeto;
- resumir arquivos importantes;
- registrar fluxo conhecido;
- consultar fluxos já documentados;
- reduzir contexto antes de gerar documentação;
- preparar contexto para outra skill.

## Regras

- Não commitar .legacy-doc-agent/.
- Não armazenar secrets.
- Não armazenar senhas.
- Não armazenar tokens.
- Não armazenar credenciais.
- Preferir resumos objetivos.
- Guardar evidências.
- Guardar hash ou referência de validade quando possível.
- Marcar como obsoleto quando o arquivo mudar.
- A memória local é auxiliar; o código é a fonte final de verdade.

## Arquivos de Memória

- project-profile.md
- known-flows.json
- external-dependencies.json
- messaging.json
- persistence.json
- summaries/
- runs/

## Formato de Resumo de Arquivo

```markdown
# File Summary: <arquivo>

## Type

<tipo do arquivo>

## Responsibilities

- <responsabilidade>

## Important Symbols

- <classe/método>

## Dependencies

- <dependência>

## Evidence

- <evidência>

## Hash

<hash quando disponível>

## Status

valid | stale | unknown
```
