# Instruções Globais para Copilot

Ao auxiliar na documentação de sistemas legados, siga estas regras:

1. Priorize documentação rastreável.
2. Nunca invente classes, métodos, serviços, endpoints, tópicos ou filas.
3. Sempre indique evidências.
4. Quando houver dúvida, declare explicitamente.
5. Use Mermaid para diagramas.
6. Use `sequenceDiagram` para fluxo técnico.
7. Use `flowchart TD` para fluxo de negócio.
8. Separe fatos de inferências.
9. Não documente comportamento não confirmado pelo código.
10. Prefira documentação curta, objetiva e útil para manutenção.
11. Sempre gere checklist de revisão.
12. Sempre inclua seção de pontos não identificados.
13. Use memória local apenas como apoio.
14. A fonte final de verdade é o código.
15. Quando houver uma etapa de revisão, use o agente de revisão para validar a saída do agente de geração.
16. Siga o fluxo de orquestração descrito em `workflows/README.md` sempre que possível.
17. Produza saída compatível com o contrato em `workflows/output-contract.json`.
18. Quando o escopo estiver grande ou ambíguo, reduza o escopo antes de gerar a documentação.
19. Não sugira commitar `.legacy-doc-agent/`.
20. Não armazene secrets, senhas, tokens ou credenciais na memória local.
