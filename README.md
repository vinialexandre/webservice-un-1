<h1>Atividade Integradora - Desenvolvimento de um webservice</h1>
<p>A proposta desta atividade integradora é a implementação de um web service de arquitetura REST capaz de fornecer informações de um banco de alunos que será disponibilizado em um servidor web local. Para tanto, será utilizada uma classe cliente simples que consumirá este web service.</p>
<p>A linguagem utilizada será Java em conjunto com a API JAX-RS. A API para web services REST em Java. Recomendo que utilizem o framework Eclipse Jersey, que é a implementação referência desta API. O website do framework é o seguinte: <a href="https://eclipse-ee4j.github.io/jersey/" target="_new">https://eclipse-ee4j.github.io/jersey/</a></p>
<p>Para auxiliar na configuração do ambiente, foi disponibilizado um tutorial em vídeo com a instalação e configuração necessária, bem como a forma de testar se o ambiente está funcional. Neste tutorial é utilizado o maven para gerenciar as dependências.</p>
<p>Ao todo, serão avaliados três quesitos:</p>
<ul>
   <li>Serviço 1: Um serviço do tipo GET que não recebe nenhum parâmetro e retorna um arquivo JSON contendo a lista de todos alunos.</li>
   <li>Serviço 2: Um serviço do tipo GET que recebe como parâmetro um número de id e retorna um arquivo JSON com todas informações sobre o aluno com o id especificado.</li>
   <li>Consumo do serviço: A classe cliente deverá consumir os dois serviços e fazer uma impressão em texto dos dados retornados no console.</li>
</ul>
<p>A entrega esperada é um arquivo zip contendo o projeto dos web services e o projeto da classe cliente. O local para upload do arquivo será disponibilizado na Unidade 6.</p>
<p>Para os dados dos alunos, a classe Aluno deve conter as seguintes variáveis:</p>
<ul>
   <li>int id;</li>
   <li>String nome;</li>
   <li>String email;</li>
   <li>int ciclo;</li>
</ul>
<p>A lista de alunos será criada ao inicializar a classe main do servidor e deverá ser armazenada em memória como um ArrayList de Aluno, para simular um banco de dados. A lista de alunos é a seguinte (vocês podem incluir novos alunos à vontade):</p>
<pre><div class="bg-black mb-4 rounded-md"><div class="flex items-center relative text-gray-200 bg-gray-800 px-4 py-2 text-xs font-sans"><span class="">csharp</span><button class="flex ml-auto gap-2"><svg stroke="currentColor" fill="none" stroke-width="2" viewBox="0 0 24 24" stroke-linecap="round" stroke-linejoin="round" class="h-4 w-4" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M16 4h2a2 2 0 0 1 2 2v14a2 2 0 0 1-2 2H6a2 2 0 0 1-2-2V6a2 2 0 0 1 2-2h2"></path><rect x="8" y="2" width="8" height="4" rx="1" ry="1"></rect></svg>Copy code</button></div><div class="p-4 overflow-y-auto"><code class="!whitespace-pre hljs language-csharp">ArrayList&lt;Aluno&gt; listaAlunos = <span class="hljs-keyword">new</span> ArrayList&lt;Aluno&gt;();
listaAlunos.<span class="hljs-keyword">add</span>(<span class="hljs-keyword">new</span> Aluno(<span class="hljs-number">1</span>, <span class="hljs-string">"Joao"</span>, <span class="hljs-string">"joao@joao.com"</span>,<span class="hljs-number">3</span>));
listaAlunos.<span class="hljs-keyword">add</span>(<span class="hljs-keyword">new</span> Aluno(<span class="hljs-number">2</span>, <span class="hljs-string">"Maria"</span>, <span class="hljs-string">"maria@maria.com"</span>,<span class="hljs-number">1</span>));
listaAlunos.<span class="hljs-keyword">add</span>(<span class="hljs-keyword">new</span> Aluno(<span class="hljs-number">3</span>, <span class="hljs-string">"Jose"</span>, <span class="hljs-string">"jose@mariajoao.com"</span>,<span class="hljs-number">2</span>));
listaAlunos.<span class="hljs-keyword">add</span>(<span class="hljs-keyword">new</span> Aluno(<span class="hljs-number">4</span>, <span class="hljs-string">"Pedro"</span>, <span class="hljs-string">"pedro@email.com"</span>,<span class="hljs-number">3</span>));
</code></div></div></pre>