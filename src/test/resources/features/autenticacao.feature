#language:pt
  @Autenticacao

  Funcionalidade: Realizar autenticação. Testes da API de login

    @SerieA
    Cenario:[GET] = Validar token de autenticacao
      Dado que eu realizo a consulta da autenticacao
      Entao eu recebo o status code com valor 200
      E eu recebo o token


