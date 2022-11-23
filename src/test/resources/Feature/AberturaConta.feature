 @aberturaconta
Feature: Abertura de conta

 @pf
 Scenario Outline: Abertura de conta pessoa fisica
 Given que o usuario acesse a url "https://www.original.com.br/"
 And (E) selecionar o botao cookies
 And (E)selecionar o botao abrir conta
 And (E)selecionar o botao abrir conta pra voce
# When (quando)preencher o formulario de abertura de conta
 And (E) preencher o campo nome "<nome>"
 And (E) preencher o campo email "<email>"
 And (E) preencher o campo telefone "<telefone>"
 And (E) preencher o campo cpf "<cpf>"
 And (E)selecionar o botao quero ser cliente
 Then (Então)sera exibido o texto Falta pouco
 
 
                         Examples:
 
                         |nome          |email               |telefone   |cpf        |
                         |Samuel        |teste@teste.com,br  |11912345678|71413259057|
                       # |Genari        |teste2@teste.com.br |11923456788|34530419096|
         