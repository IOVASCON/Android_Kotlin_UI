# Android UI Tests with Kotlin and Espresso

Este projeto demonstra como criar testes automatizados de UI em Android usando Kotlin e Espresso.

## Estrutura do Projeto

![Estrutura do Projeto](Estrutura.png)

- **app/src/main/java/com/example/uiTests/TaskActivity.kt**: A Activity principal que está sendo testada.
- **app/src/main/res/layout/activity_task.xml**: O layout XML para `TaskActivity`.
- **app/src/androidTest/java/com/example/uiTests/TaskActivityTest.kt**: Os testes de UI escritos usando Espresso.
- **app/src/test/java/com/example/uiTests/ExampleUnitTest.kt**: Testes unitários de exemplo.

## Pré-requisitos

- Android Studio
- Kotlin
- Gradle

## Configuração

1. Clone o repositório:

   git clone [https://github.com/IOVASCON/Android_Kotlin_UI.git]

2. Navegue até o diretório do projeto:

    cd Android_UI_Kotlin

3. Sincronize o projeto no Android Studio para baixar todas as dependências.

## Executando Testes

### Testes de UI

Para executar os testes de UI, abra o arquivo TaskActivityTest.kt e execute os testes:

    No Android Studio, clique com o botão direito no arquivo TaskActivityTest.kt.
    Selecione Run 'TaskActivityTest'.

### Testes Unitários

Para executar os testes unitários, abra o arquivo ExampleUnitTest.kt e execute os testes:

    No Android Studio, clique com o botão direito no arquivo ExampleUnitTest.kt.
    Selecione Run 'ExampleUnitTest'.

## Contribuição

    Faça um fork do projeto.
    Crie uma nova branch (git checkout -b feature/nova-funcionalidade).
    Commit suas alterações (git commit -am 'Adiciona nova funcionalidade').
    Faça o push para a branch (git push origin feature/nova-funcionalidade).
    Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.
