# 🔐 Introdução ao Spring Security – Parte 1 (Conceitos)

Este projeto apresenta os conceitos fundamentais do Spring Security, focando na segurança de APIs REST desenvolvidas com Spring Boot.

---

## 1️⃣ O que é Spring Security?

O Spring Security é um framework do ecossistema Spring responsável por proteger aplicações Java. Ele oferece recursos como autenticação, autorização, controle de acesso e proteção contra ataques comuns, além de permitir integração com diferentes estratégias de segurança, como JWT, OAuth2 e Basic Auth.

---

## 2️⃣ Para que serve o método `csrf().disable()`?

O método `csrf().disable()` desativa a proteção contra ataques do tipo CSRF (Cross-Site Request Forgery).  
Essa configuração é comum em APIs REST stateless, onde não há uso de sessões ou formulários HTML, tornando essa proteção desnecessária.

---

## 3️⃣ O que significa `SessionCreationPolicy.STATELESS`?

Essa política define que a aplicação não deve criar nem manter sessões HTTP.  
Cada requisição precisa conter todas as informações necessárias para autenticação, tornando a API mais escalável e alinhada ao padrão REST.

---

## 4️⃣ Qual a função do `permitAll()`?

O método `permitAll()` permite acesso irrestrito às rotas configuradas, ou seja, qualquer usuário pode acessá-las, mesmo sem autenticação.

---

## 5️⃣ O que faz o `requestMatchers()`?

O `requestMatchers()` é utilizado para definir quais endpoints ou padrões de URL terão regras específicas de segurança, como liberação de acesso ou exigência de autenticação.

---

## 6️⃣ Qual a função do `anyRequest().authenticated()`?

Essa configuração indica que todas as requisições que não foram explicitamente liberadas exigirão autenticação para serem acessadas.

---

## 7️⃣ O que é uma API Stateless?

Uma API Stateless é aquela que não armazena estado do usuário no servidor.  
Cada requisição é independente e deve conter todas as informações necessárias, como tokens de autenticação.

---

## 8️⃣ O que faz a configuração abaixo?

```java
session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
```

Essa configuração define que o Spring Security não deve criar nem manter sessões HTTP.
Cada requisição é tratada de forma independente, o que caracteriza uma API stateless e é ideal para APIs REST.
