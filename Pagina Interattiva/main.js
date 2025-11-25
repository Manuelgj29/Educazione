// Messaggio iniziale
function saluta() {
  let nome = prompt("Come ti chiami?");
  document.getElementById("messaggio").innerText = "Ciao " + nome + "! 🚀 Benvenuto nel mondo dell'informatica!";
}

// Mostra info sui linguaggi
function mostraInfo(arg) {
  let testo = "";
  if (arg === "java") testo = "Java: linguaggio di programmazione per logica, algoritmi e applicazioni.";
  if (arg === "html") testo = "HTML: struttura delle pagine web, come ossa di un corpo.";
  if (arg === "css") testo = "CSS: stile e colori delle pagine, come vestiti eleganti.";
  if (arg === "js") testo = "JavaScript: interattività, animazioni e giochi nei siti web.";
  document.getElementById("info-text").innerText = testo;
}

// Quiz
function risposta(ans) {
  let result = "";
  if (ans === "css") {
    result = "✅ Esatto! CSS serve per dare stile alle pagine.";
  } else {
    result = "❌ Non proprio... riprova!";
  }
  document.getElementById("quiz-result").innerText = result;
}
