# Plan Gate

Este checkpoint garante que o agente não avance para a geração final sem um plano mínimo válido.

## Condições para prosseguir

- o entrypoint foi identificado;
- o objetivo da documentação foi declarado;
- os arquivos principais foram listados;
- as dúvidas ou limitações foram registradas;
- o plano foi emitido no formato de `workflows/plan-output-template.json`.

## Se alguma condição falhar

- parar a execução;
- pedir esclarecimento;
- reduzir o escopo;
- ou reformular o plano antes de gerar a documentação final.
