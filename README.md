# 🛠️ Sistema de Gestão para Posto de Combustível

Projeto desenvolvido como parte do curso de Análise e Desenvolvimento de Sistemas (IFPE), com o objetivo de gerenciar as principais operações de um posto de combustível, incluindo vendas, controle de estoque, fidelidade de clientes, controle de ponto de funcionários, emissão de notas fiscais e geração de relatórios.

---

## 📌 Funcionalidades Principais

- ✅ Cadastro de clientes e funcionários
- ⛽ Controle de estoque de combustíveis e produtos de loja de conveniência
- 💰 Registro de vendas com múltiplas formas de pagamento
- 🧾 Emissão de notas fiscais com cálculo de desconto
- 📊 Relatórios de vendas e desempenho
- 🕒 Controle de ponto e banco de horas de funcionários
- 🎁 Sistema de fidelidade com acúmulo e resgate de pontos
- 🔐 Acesso com diferentes perfis (gerente e atendente)

---

## 🧱 Estrutura de Classes

As classes foram divididas entre os membros do grupo, com base em responsabilidades específicas:

### 👤 Pessoa 1 – Pessoas e Funcionários
- `Pessoa` (abstrata)
- `Cliente`
- `Funcionario`
- `PontoFuncionario`
- `Gerente`

### 🛒 Pessoa 2 – Produtos e Vendas
- `Produto` (abstrata)
- `Combustivel`
- `LojaConveniencia`
- `Venda`
- `ItemVenda`

### 💸 Pessoa 3 – Financeiro e Relatórios
- `Pagamento`
- `NotaFiscal`
- `FormaPagamento` (enum)
- `HistoricoVenda`
