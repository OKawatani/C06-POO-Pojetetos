# Uso de IA — Documentação de Prompts

**Modelo utilizado:** Claude (Anthropic)

Esta seção documenta o uso de Inteligência Artificial (Claude) durante o desenvolvimento do exercício prático C06 - PCMania, conforme exigido nas instruções do exercício.

## Contexto de uso

A IA foi utilizada como ferramenta de apoio para tirar dúvidas conceituais sobre composição e agregação em UML/POO, revisar trechos de código já escritos pelo autor, e identificar inconsistências entre a implementação e o diagrama/enunciado fornecidos pelo professor. O código final foi escrito e ajustado pelo próprio aluno a partir dessas orientações.

## 

## Lista de prompts enviados (em ordem cronológica)



1. **Dúvida conceitual sobre composição**: Apresentação do código inicial (`Main`, `Computador`, `HardwareBasico`, `SistemaOperacional`) perguntando se a composição entre `Computador` e as classes `SistemaOperacional`/`HardwareBasico` havia sido implementada corretamente.
2. **Aprofundamento sobre construtores**: Pergunta se ter construtores `public` em `HardwareBasico` e `SistemaOperacional` invalidava a composição, já que permitiria criar esses objetos separadamente.
3. **Dúvida sobre agregação**: Pergunta se seria possível criar um objeto `MemoriaUSB` na `Main` e depois agregá-lo à classe `Computador`.
4. **Dúvida sobre organização em pacotes**: Pergunta sobre quais classes seriam necessárias importar para implementar o menu do sistema dentro da classe `Cliente`, dado que o projeto possui os pacotes `Cliente` e `Computador` e uma classe `Main` fora de pacotes.
5. **Dúvida de design — menu na Main**: Pergunta se implementar o menu diretamente na classe `Main`, em vez de na classe `Cliente`, seria uma abordagem válida.





## Avaliação do resultado

O uso da IA foi **satisfatório** como ferramenta de revisão e apoio conceitual. A IA ajudou a identificar erros de compilação, inconsistências lógicas (como a conversão incorreta de unidades de armazenamento) e desalinhamentos entre a implementação e o diagrama UML fornecido pelo professor. Vale destacar que, em pelo menos duas ocasiões (itens 16 e 17), a IA fez afirmações incorretas sobre as regras do exercício, que precisaram ser corrigidas pelo próprio aluno a partir de uma releitura mais cuidadosa do enunciado — reforçando a importância de validar criticamente as respostas fornecidas pela ferramenta.

