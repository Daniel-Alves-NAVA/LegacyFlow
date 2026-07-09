```mermaid
flowchart TD
    A[Início do fluxo] --> B[Executa ação]
    B --> C{Condição de negócio}
    C -->|Sim| D[Fluxo principal]
    C -->|Não| E[Fluxo alternativo]
```
