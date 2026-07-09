# Language Profile: Java Spring Ecosystem

## Objetivo

Este perfil orienta agents e skills a documentarem projetos Java/Spring considerando não apenas arquivos `.java`, mas também arquivos de configuração, build, contratos, banco de dados e mensageria.

## Linguagens e Sintaxes Relevantes

Considere como relevantes:

- `.java`
- `.kt`
- `.groovy`
- `.yml`
- `.yaml`
- `.properties`
- `.gradle`
- `.gradle.kts`
- `.xml`
- `.json`
- `.sql`
- `.avsc`
- `.proto`
- `.md`

## Entry Points Spring

Reconheça como possíveis pontos de entrada:

- `@RestController`
- `@Controller`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@PatchMapping`
- `@DeleteMapping`
- `@KafkaListener`
- `@RabbitListener`
- `@Scheduled`
- Spring Batch Jobs
- Command Handlers
- Event Handlers
- Consumers
- Producers

## Camadas Comuns

Reconheça as seguintes camadas:

- Controller
- Listener
- Consumer
- Producer
- UseCase
- Service
- Application Service
- Domain Service
- Repository
- Gateway
- Client
- Mapper
- DTO
- Entity
- Config
- Scheduler
- Batch Reader
- Batch Processor
- Batch Writer

## Arquivos de Configuração

Ao documentar fluxos Java/Spring, verifique quando disponíveis:

- `application.yml`
- `application.yaml`
- `application.properties`
- `bootstrap.yml`
- `bootstrap.properties`
- `build.gradle`
- `build.gradle.kts`
- `pom.xml`
- arquivos de configuração Kafka
- arquivos de configuração RabbitMQ
- arquivos de configuração Feign/HTTP Client
- arquivos de migrations SQL
- schemas Avro ou Proto

## Regras

1. Use nomes reais das classes.
2. Não substitua `UseCase` por `Service` se a classe real for `UseCase`.
3. Não substitua `Gateway` por `Client` se o código usa `Gateway`.
4. Identifique tópicos e filas por annotations e arquivos de configuração.
5. Identifique endpoints por annotations Spring MVC.
6. Identifique persistência por repositories, DAOs, gateways ou clients.
7. Identifique eventos publicados por producers, templates ou clients de mensageria.
8. Quando configuração estiver em `.yml`, `.yaml` ou `.properties`, liste o arquivo como evidência.
9. Quando o fluxo depender de build, plugins ou dependências, consulte `build.gradle`, `build.gradle.kts` ou `pom.xml`.
10. Não invente comportamento não confirmado por código ou configuração.
