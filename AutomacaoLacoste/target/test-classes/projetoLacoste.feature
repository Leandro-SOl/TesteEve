#Author: leandrooliveira.lo52@gmail.com
Feature: Fazer compras no site
  Eu como usuario quero acessar o site para fazer consultar 

  Scenario: Fazer consulta
    Given que eu esteja no "https://www.lacoste.com/br/"
    When consultar alguma peca de roupa
    And adicionar no carrinho
    Then consulta realizada com sucesso 
