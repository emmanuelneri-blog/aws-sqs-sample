# aws-sqs-sample

Exemplos da utilização de SQS(Amazon Simple Queue Service) nos posts: [Enviando mensagens para o Amazon SQS](https://wp.me/p5RSbg-iE) e [Consumindo fila do SQS com JMS e Spring Boot](https://wp.me/p5RSbg-iG).

O exemplo é dividido em duas aplicações: Producer e Consumer, o producer responsável por disponibilizar endpoints para inserir as mensagens na fila do SQS e o consumer responsável por receber as mensagens da fila.

## Pré requisito

- Maven 3
- Java 8
- Acesso na [AWS](console.aws.amazon.com) 
- Configuração do [Default Credential Provider](http://docs.aws.amazon.com/pt_br/sdk-for-java/v1/developer-guide/credentials.html), as credenciais da AWS no arquivo ```.aws/credentials```.

## Configurando SQS

- Acessar Console home -> Application Integration -> Simple Queue Service 
- Criar Queue com o nome ```awsSQSMessage``` do tipo ```Standard Queue```

## Preparando ambiente

- ```cd aws-sqs-sample```
- ```mvn clean package```

## Executando 

#### Enviando mensagens para o SQS

- ```cd aws-sqs-sample/producer```
- ```mvn spring-boot:run```


#### Consumindo fila do SQS

- ```cd aws-sqs-sample/consumer```
- ```mvn spring-boot:run```
