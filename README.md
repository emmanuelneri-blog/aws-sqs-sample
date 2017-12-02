# aws-sqs-sample

Exemplos da utilização de SQS(Amazon Simple Queue Service) em aplicações Spring Boot.

O exemplo é dividido em duas aplicações: Producer e Consumer, o producer responsável por disponibilizar endpoints para inserir as mensagens na fila do SQS e o consumer responsável por receber as mensagens da fila.

## Pré requisito
Configurar [Default Credential Provider](http://docs.aws.amazon.com/pt_br/sdk-for-java/v1/developer-guide/credentials.html) com as credenciais da AWS no arquivo ```.aws/credentials```.
