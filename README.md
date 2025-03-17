# 2025-03-17-soc-and-mvc

Como uma arquitetura é guiada. Existem Princípios, "Regras", e Padrões de Arquitetura (Padrão de Projeto de Alto Nível - _"no macro"_).

Uma ideia central da Arquitura é dividir em partes.

## SOC (Separation of Concerns - Separação de Preocupações)

Serve para escolher as "partes", seja do ponto de vista técnico (ex.: como será a conexão e operações com o Banco de Dados?) ou de domínio (ex.: como será o subsistema para cartão de crédito?).

Existem várias formas de fatiar uma aplicação. Algumas formas são repetíveis (emerge um Padrão).

## MVC (Model-View-Controller)

Divide a aplicação em três componentes principais:

- Modelo (a lógica e dados central)
- Visão (a apresentação dos dados)
- Controlador (o mediador de eventos recebidos e direcionador das visões)

