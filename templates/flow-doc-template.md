# Fluxo: <nome-do-fluxo>

## Tipo de Documentação

- [ ] Fluxo técnico
- [ ] Fluxo de negócio
- [ ] Ambos

## Objetivo

<descrever o objetivo do fluxo>

## Entry Point

| Item | Valor |
|---|---|
| Classe | `<classe>` |
| Método | `<método>` |
| Tipo | Controller/Listener/Consumer/Job/Service/etc |

## Diagrama Técnico

```mermaid
sequenceDiagram
    autonumber
```

## Diagrama de Negócio

```mermaid
flowchart TD
```

## Descrição do Fluxo

<descrição objetiva>

## Participantes Técnicos

| Participante | Tipo | Responsabilidade | Evidência |
|---|---|---|---|

## Dependências Internas

| Dependência | Tipo | Evidência |
|---|---|---|

## Dependências Externas

| Dependência | Tipo | Evidência |
|---|---|---|

## Eventos, Tópicos e Filas

| Nome | Tipo | Direção | Evidência |
|---|---|---|---|

## Endpoints

| Método | Path | Responsabilidade | Evidência |
|---|---|---|---|

## Persistência

| Item | Tipo | Evidência |
|---|---|---|

## Regras de Negócio Identificadas

| Regra | Evidência | Observação |
|---|---|---|

## Tratamento de Erros

| Erro/Exceção | Comportamento | Evidência |
|---|---|---|

## Observabilidade

| Item | Evidência |
|---|---|
| Logs | `<arquivo>` |
| Métricas | `<arquivo>` |
| Tracing | `<arquivo>` |

## Memória Local Utilizada

| Item | Valor |
|---|---|
| Usou memória local? | Sim/Não |
| Arquivos de memória consultados | `<arquivos>` |
| Memória considerada válida? | Sim/Não/Parcial |

## Evidências Analisadas

- `<arquivo1>`
- `<arquivo2>`

## Pontos Não Identificados

- `<ponto não identificado>`

## Checklist de Revisão

- [ ] O Mermaid renderiza corretamente.
- [ ] Os participantes existem no código.
- [ ] As chamadas existem no código.
- [ ] As dependências internas foram confirmadas.
- [ ] As dependências externas foram confirmadas.
- [ ] Os tópicos, filas ou endpoints foram confirmados.
- [ ] As regras de negócio possuem evidência.
- [ ] As dúvidas foram explicitadas.
- [ ] A memória local usada estava válida.
- [ ] A documentação foi revisada por um desenvolvedor.
