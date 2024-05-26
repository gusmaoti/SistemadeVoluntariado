# Sistema de Gestão de Assistência Humanitária

## Descrição
Este sistema foi desenvolvido para auxiliar na coordenação e distribuição de assistência humanitária em resposta a uma tragédia que assolou o estado do Rio Grande do Sul, deixando centenas de famílias desabrigadas e em situação de vulnerabilidade. Com o objetivo de gerenciar de forma eficiente as doações, voluntários e instituições de caridade envolvidas na prestação de auxílio às vítimas, este sistema oferece funcionalidades abrangentes para registrar e acompanhar doações e voluntários, bem como para facilitar a comunicação e a operação das instituições de caridade.

### Objetivos do Sistema
- **Gerenciamento de Doações**: Registro e acompanhamento de doações feitas por indivíduos ou entidades, detalhando o tipo, valor e data da doação.
- **Gerenciamento de Voluntários**: Cadastro e organização de voluntários com base em suas habilidades e disponibilidade de horário.
- **Apoio às Instituições de Caridade**: Facilitar a administração de instituições de caridade, incluindo a gestão de seus voluntários e doações recebidas.

## Estrutura do Projeto
O projeto está organizado em várias classes principais, cada uma representando um componente essencial do sistema:

- **Doador**: Representa um doador, contendo informações pessoais (nome, CPF, endereço, contato) e histórico de doações realizadas.
- **InstituicaoCaridade**: Representa uma instituição de caridade, contendo informações de contato, área de atuação, voluntários associados e histórico de doações recebidas.
- **Voluntario**: Representa um voluntário, contendo informações pessoais, disponibilidade de horário e habilidades.
- **Doacao**: Representa uma doação, contendo informações sobre o doador, instituição beneficiada, tipo de doação, valor e data da doação.
- **Main**: Classe principal que demonstra a usabilidade do sistema, criando instâncias de doadores, instituições e voluntários, e exibindo informações relevantes.

## Diagrama de Classes
[jLAnJiCm4Dtz5HuBA6AFK5L45YGs9FQhVPH3ZY-oprqG_qwQEB4KeWe4xUBclHVdlRktYm91KkkKSH2ZRXWi1_sXTF-hjESMQ_qiWVmXGwPxNI3eBGOql1Io5v0b-aPHE93XXi4mnbe_zSZTwGbugmRLZJwW28Pu6ySpes3947i8etep7bUrFZ9PzQboXaSVXIHHppr080iMpmRotVjV4a](https://github.com/gusmaoti/SistemadeVoluntariado/assets/128652005/320719c6-8525-443c-bf3a-39754939a64f)

## Como Executar

### Requisitos
- Java 8 ou superior

### Passos para Compilar e Executar

1. **Compile as classes Java**:
   Navegue até o diretório do projeto onde os arquivos `.java` estão localizados e compile-os.
   ```sh
   javac -d build src/*.java
