# ATV2-SpringSecurity

1 Explique com suas palavras o que é Spring Security. R: é um framework do java focado em autentificação e controle de acesso.

2 Para que serve o método csrf().disable()? R: Esse método serve para desativar o Spring Security.

3 Explique o que significa SessionCreationPolicy.STATELESS. R: O stateless serve para não guardar as informações do usuario.

4 Qual a função do permitAll()? R: Essa função permite que qualquer usuario possa usar uma determinada ação como POST, GET, PUT.

5 Explique o que faz o requestMatchers(). R: usado para selecionar quais URLs e metodos http terão regras de segurança específicas a eles

6 Qual a função do anyRequest().authenticated()? R:serve para definir que qualquer requisição feita ao sistema exige que o usuario esteja autenticado

7 O que é uma API Stateless? R: o servidor não armazena nenhuma informação sobre as interações anteriores do usuário

8 Explique o que a lambda abaixo faz: session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS) R: O stateless serve para não guardar as informações do usuario.
