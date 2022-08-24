#language:pt
  @bank

  Funcionalidade: Validar a listagem, cadastro e alteração do cadastro bancos

    @SerieA
    Esquema do Cenario: [GET] Validar a consulta de banco
      Dado que eu realizo a consulta da autenticacao
      Quando realizo a consulta dos bancos cadastrado
      Entao eu recebo o status code com valor 200
      E as informacoes dos cadastro <id> <banco> <estadoAtuacao> <juros> <aux>
      Exemplos:
      |tipos             |id  |banco                      |estadoAtuacao|juros   |aux|
      |Banco do Brasil   |"1" |"Banco do Brasil"          |"SC"         |"11,25%"|"0"|
      |Banco do Caixa    |"2" |"Caixa Econômica Federal"  |"SP"         |"10,75%"|"1"|
      |Banco do Santander|"3" |"Banco Santander"          |"PR"         |"13,00%"|"2"|
      |Banco do Itaú     |"4" |"Banco Itaú"               |"SC"         |"12,50%"|"3"|
      |Banco Mercantil   |"5" |"Banco Mercantil do Brasil"|"SC"         |"11,50%"|"4"|
      |Banco Safra       |"6" |"Banco Safra"              |"SP"         |"12,50%"|"5"|
      |Banco Bradesco    |"7" |"Banco Bradesco"           |"SC"         |"12,50%"|"6"|
      |Banco Inter       |"8" |"Banco Inter"              |"SP"         |"10,50%"|"7"|
      |Banco Nubank      |"9" |"Nubank"                   |"SC"         |"10,75%"|"8"|
      |Banco original    |"10"|"Banco Original"           |"SP"         |"12,50%"|"9"|


    @SerieA
    Esquema do Cenario: [GET] Validar a consulta de banco utilizando filtro
      Dado que eu realizo a consulta da autenticacao
      Quando realizo a busca dos bancos cadastrado utilizando filtro <estadoAtuar>
      Entao eu recebo o status code com valor 200
      E as informacoes dos cadastro do estado escolhido <id> <banco> <estadoAtuacao> <juros> <aux>
      Exemplos:
        |tipos             |estadoAtuar|id |banco                      |estadoAtuacao|juros   |aux|
        |Banco do Brasil   |"SC"       |"1"|"Banco do Brasil"          |"SC"         |"11,25%"|"0"|
        |Banco do Itaú     |"SC"       |"4"|"Banco Itaú"               |"SC"         |"12,50%"|"1"|
        |Banco Mercantil   |"SC"       |"5"|"Banco Mercantil do Brasil"|"SC"         |"11,50%"|"2"|
        |Banco Bradesco    |"SC"       |"7"|"Banco Bradesco"           |"SC"         |"12,50%"|"3"|
        |Banco Nubank      |"SC"       |"9"|"Nubank"                   |"SC"         |"10,75%"|"4"|



    @SerieA
    Cenario: [POST] Cadastro de um novo banco
      Dado que eu realizo a consulta da autenticacao
      Quando realizo uma requisicao do tipo POST no cadastro de banco
      Entao eu recebo o status code 201
