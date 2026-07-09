# Plan Approval

Este passo adiciona um controle explícito de aprovação do plano antes da geração da documentação final.

## Comportamento

1. O agente produz o plano estruturado.
2. O plano é avaliado contra o checkpoint de aprovação.
3. Se o plano estiver completo e coerente, ele é aprovado.
4. Se houver ambiguidades, escopo excessivo ou evidências insuficientes, o plano é rejeitado e precisa ser refinado.

## Critérios de aprovação

- o entrypoint está claro;
- o objetivo está explícito;
- os arquivos principais foram identificados;
- as limitações foram declaradas;
- o plano segue o formato de `workflows/plan-output-template.json`.

## Regras

- Não prosseguir para a geração sem aprovação do plano.
- Se rejeitado, reformular o plano antes de continuar.
- Se o escopo estiver muito grande, reduzir o escopo antes de pedir aprovação.
- A resposta de aprovação deve ser simples e explícita, seguindo o formato em `workflows/plan-approval-response-template.json`.
