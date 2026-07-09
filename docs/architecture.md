# Arquitetura

O projeto é dividido em quatro blocos principais:

- agentes: definem o papel do Copilot na documentação de fluxos legados;
- skills: orientam a execução de tarefas específicas como documentação, revisão e manutenção de memória;
- templates e prompts: padronizam a saída e facilitam a interação no IDE;
- memória local: reduz contexto e preserva conhecimento entre sessões.

O fluxo principal é:

1. o desenvolvedor seleciona um entrypoint;
2. o Copilot consulta as guidelines e a memória local;
3. o conteúdo é gerado em Markdown com Mermaid;
4. a documentação é revisada e eventualmente commitada.
