# Skill: estimate-doc-token-cost

## Objetivo

Estimar o tamanho do contexto e o custo aproximado de tokens para gerar documentação de um fluxo.

## Quando Usar

Use antes de gerar documentação grande, especialmente quando houver muitos arquivos envolvidos.

## Heurística de Estimativa

Use aproximações conservadoras:

- 1 linha de código simples: 8 a 15 tokens;
- 1 arquivo pequeno: 500 a 2.000 tokens;
- 1 arquivo médio: 2.000 a 8.000 tokens;
- 1 arquivo grande: 8.000+ tokens;
- prompt fixo da skill: 800 a 1.500 tokens;
- resposta Mermaid + Markdown: 1.500 a 5.000 tokens;
- revisão adicional: 2.000 a 8.000 tokens.

## Formato de Saída

```markdown
# Estimativa de Tokens

## Contexto Informado

| Item | Valor |
|---|---|
| Arquivos analisados | X |
| Linhas aproximadas | X |
| Tipo de fluxo | Listener/Controller/Job/etc |
| Complexidade | Baixa/Média/Alta |

## Estimativa

| Categoria | Tokens estimados |
|---|---:|
| Prompt fixo | 1.000 |
| Código/contexto | 12.000 |
| Geração da documentação | 3.000 |
| Revisão | 4.000 |
| Total estimado | 20.000 |

## Recomendações

- Reduzir arquivos irrelevantes.
- Abrir apenas classes diretamente relacionadas.
- Separar fluxo técnico de fluxo de negócio.
- Reutilizar memória local quando válida.
- Gerar documentação por entrypoint, não pelo repositório inteiro.
```
