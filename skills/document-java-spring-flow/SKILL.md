# Skill: document-java-spring-flow

## Objetivo

Documentar fluxos técnicos e de negócio em aplicações Java/Spring, considerando código-fonte, configurações e arquivos auxiliares do ecossistema Spring.

## Quando Usar

Use esta skill quando o usuário pedir para documentar um fluxo em projeto Java/Spring iniciado por:

- REST Controller;
- Kafka Listener;
- RabbitMQ Listener;
- Scheduler;
- Batch Job;
- Use Case;
- Service;
- Command Handler;
- Event Handler;
- Producer;
- Consumer;
- método ou classe específica.

## Arquivos Relevantes

Considere, quando disponíveis:

- `.java`
- `.kt`
- `.groovy`
- `.yml`
- `.yaml`
- `.properties`
- `.gradle`
- `.gradle.kts`
- `.xml`
- `.sql`
- `.json`
- `.avsc`
- `.proto`
- `.md`

## Regras Obrigatórias

1. Use nomes reais de classes, métodos e arquivos.
2. Não invente chamadas.
3. Não invente dependências externas.
4. Não invente tópicos, filas, endpoints ou regras de negócio.
5. Diferencie chamadas síncronas de eventos assíncronos.
6. Liste evidências analisadas.
7. Declare pontos não identificados.
8. Consulte arquivos de configuração quando o fluxo depender deles.
9. Consulte arquivos de build quando dependências ou plugins forem relevantes.
10. Use o perfil `java-spring-ecosystem.md`.
11. Se a memória local estiver disponível, use-a apenas como apoio.
12. Se a memória local estiver desatualizada ou sem evidência, prefira o código atual.

## Processo

1. Identificar o entrypoint.
2. Classificar o tipo de entrypoint.
3. Identificar participantes técnicos.
4. Identificar chamadas internas.
5. Identificar chamadas externas.
6. Identificar persistência.
7. Identificar eventos, tópicos e filas.
8. Identificar endpoints.
9. Identificar arquivos de configuração relacionados.
10. Gerar diagrama técnico.
11. Gerar diagrama de negócio, se possível.
12. Listar evidências.
13. Listar pontos não identificados.
14. Gerar checklist de revisão.
