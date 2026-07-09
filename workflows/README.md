# Workflow de Orquestração

Este fluxo define a sequência recomendada para o harness de documentação legado.

## Etapas

1. Scope definition
   - identificar o entrypoint e o escopo da documentação.
2. Plan first
   - criar um plano mínimo de análise antes de gerar a documentação.
3. Context gathering
   - coletar arquivos relevantes, configuração e memória local.
4. Plan gate
   - validar se o plano mínimo atende às condições do checkpoint.
5. Plan approval
   - aprovar ou rejeitar o plano antes de seguir para a geração.
6. Draft generation
   - gerar a documentação inicial com o agente de geração.
7. Review
   - revisar a saída com o agente de revisão.
8. Finalization
   - consolidar a documentação final e salvar o resultado.

## Regras

- Se o escopo for muito amplo, reduzir antes de gerar.
- Se a evidência não estiver clara, registrar ponto não identificado.
- Nunca afirmar comportamento sem suporte.
