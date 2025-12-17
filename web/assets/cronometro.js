let segundos = 0;

function formatarMMSS(total) {
  const minuto = String(Math.floor(total / 60)).padStart(2, '0');
  const segundo = String(total % 60).padStart(2, '0');
  return minuto + ':' + segundo;
}

function atualizar() {
  const cronometro = document.getElementById('cronometro');
  if (!cronometro) return;
  cronometro.textContent = formatarMMSS(segundos);
}

function iniciar() {
  atualizar();
  setInterval(function () {
    segundos++;
    atualizar();
  }, 1000);
}

// garante que roda quando a página terminar de montar
document.addEventListener('DOMContentLoaded', iniciar);
