# Memória Local

A memória local é mantida em `.legacy-doc-agent/` dentro do projeto analisado.

## Objetivo

- reduzir consumo de tokens;
- preservar contexto entre sessões;
- registrar fluxos já documentados;
- facilitar backup e restauração.

## Regras

- não versionar a pasta;
- não incluir secrets ou credenciais;
- tratar a memória como suporte, não como fonte final de verdade;
- considerar resumos como obsoletos quando o arquivo mudar.
