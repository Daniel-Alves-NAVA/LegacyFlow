# Guia de uso do Legacy Doc Kit

## Objetivo

Este documento é um resumo prático para que outros colegas possam usar o Legacy Doc Kit no dia a dia, principalmente para documentar fluxos de sistemas legados com GitHub Copilot.

## O que o projeto oferece

- geração de documentação técnica e de negócio;
- uso de Mermaid para diagramas;
- revisão com foco em evidências e redução de alucinação;
- padronização de prompts, templates e skills.

## Pré-requisitos

- GitHub Copilot habilitado no ambiente;
- Java e Gradle disponíveis;
- acesso ao repositório do kit.

## Instalação

Na raiz do projeto, execute:

```bash
./gradlew installGuidelines
```

O conteúdo será instalado no diretório padrão:

```text
~/.company/copilot-guidelines
```

## Como usar

1. Abra no editor os arquivos que representam o fluxo a ser documentado.
2. Use o Copilot com um pedido claro, por exemplo:

```text
Documente este fluxo seguindo as guidelines do Legacy Doc Kit.
```

3. Se necessário, use o agente de revisão para validar a documentação gerada.
4. Atualize a memória local quando houver contexto importante.

## Fluxo recomendado

- identificar o ponto de entrada do fluxo;
- mapear os participantes e integrações;
- gerar documentação técnica;
- gerar visão de negócio, quando aplicável;
- revisar a saída antes de compartilhar.

## Boas práticas

- documente um fluxo por vez;
- baseie a documentação no código e nas configurações;
- não invente nomes, endpoints, filas ou serviços;
- registre pontos não identificados quando houver dúvida;
- revise antes de finalizar.

## Estrutura do repositório

- agents: agentes para geração e revisão;
- skills: habilidades reutilizáveis;
- prompts: instruções para uso rápido;
- templates: modelos de saída;
- workflows: fluxo de trabalho e validação.

## Observação importante

A documentação deve ser sempre rastreável e baseada em evidências. Quando não houver confirmação no código, o ideal é marcar a informação como não identificada em vez de supor.
