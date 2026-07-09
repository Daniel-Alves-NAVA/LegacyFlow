# Uso

Este pacote foi pensado para funcionar como um conjunto de guidelines corporativas para GitHub Copilot, com foco em documentação de sistemas legados.

## Fluxo sugerido

1. Selecione uma classe, método, controller, listener, consumer, producer, service ou job no IDE.
2. Abra os arquivos relacionados ao fluxo que será documentado.
3. Use um prompt de geração de documentação com contexto suficiente.
4. Revise a saída com a skill de revisão antes de compartilhar.
5. Atualize a memória local quando houver contexto relevante.
6. Faça backup da memória local ao trocar de máquina ou ao evoluir o contexto do projeto.

## Exemplo prático

```text
Documente este listener de forma técnica e de negócio, com evidências do código e diagramas Mermaid.
```

## Dicas de uso

- prefira documentar um fluxo por vez;
- não tente documentar todo o repositório de uma vez;
- confirme nomes, endpoints, filas, regras e integrações antes de finalizar;
- mantenha a documentação alinhada ao código real.
