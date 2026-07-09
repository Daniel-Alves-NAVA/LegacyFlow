# Skill: review-generated-doc

## Objetivo

Revisar uma documentação gerada por agente, procurando problemas de qualidade, rastreabilidade e possíveis alucinações.

## Quando Usar

Use esta skill depois que uma documentação técnica ou de negócio for gerada.

## Critérios de Revisão

Verifique:

1. Mermaid válido.
2. Evidências listadas.
3. Participantes existentes no contexto.
4. Métodos ou chamadas não inventadas.
5. Serviços externos confirmados.
6. Tópicos, filas e endpoints confirmados.
7. Pontos de dúvida declarados.
8. Separação entre fato e inferência.
9. Clareza do fluxo.
10. Aderência ao template.
11. Uso correto da memória local.
12. Possível uso de memória obsoleta.

## Formato de Saída

Responda em JSON Markdown:

```json
{
  "approved": false,
  "score": 0,
  "problems": [
    {
      "type": "missing_evidence",
      "severity": "high",
      "description": "A documentação cita uma dependência externa, mas não informa o arquivo de evidência."
    }
  ],
  "suggestions": [
    "Adicionar o arquivo application.yml como evidência para confirmar o tópico Kafka."
  ],
  "checklist": {
    "mermaid_valid": "unknown",
    "evidence_listed": false,
    "symbols_verified": false,
    "external_dependencies_verified": false,
    "business_rules_supported": false,
    "local_memory_checked": false
  }
}
```

## Regras

- Não reescreva a documentação inteira, a menos que o usuário peça.
- Foque em problemas.
- Classifique severidade como low, medium ou high.
- Não aprove documentação sem evidências.
