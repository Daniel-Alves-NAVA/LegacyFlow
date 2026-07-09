# Generate Legacy Flow Documentation

Use o agente `legacy-documentation-agent`.

Documente o fluxo iniciado pela classe ou método selecionado no IDE.

Considere o perfil `java-spring-ecosystem.md`.

Antes de gerar a documentação:

1. Verifique se existe memória local relevante em `.legacy-doc-agent/`.
2. Identifique o entrypoint.
3. Identifique os arquivos de código relevantes.
4. Identifique arquivos de configuração relevantes.
5. Identifique dependências internas.
6. Identifique dependências externas.
7. Identifique eventos, tópicos, filas ou endpoints.
8. Identifique persistência.
9. Liste evidências.

Gere:

1. diagrama técnico Mermaid `sequenceDiagram`;
2. descrição técnica;
3. diagrama de negócio Mermaid `flowchart TD`, se aplicável;
4. dependências internas;
5. dependências externas;
6. eventos, filas, tópicos ou endpoints;
7. persistência;
8. evidências analisadas;
9. pontos não identificados;
10. checklist de revisão.

Regras:

- Não invente informações.
- Use apenas contexto disponível.
- Liste arquivos analisados.
- Se alguma dependência não puder ser confirmada, marque como ponto não identificado.
- Diferencie chamada síncrona de evento assíncrono.
- Use o template `flow-doc-template.md`.
