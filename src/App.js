import './App.css';

function App() {return (
<div className="App">
<header className="App-header">
<div class="mb-3" >
<h1>CADASTRE-SE </h1>

<div class="row g-3 needs-validation" novalidate>
<div class="col-md-4">
<label for="validationCustom01" class="form-label">Nome completo:</label>
<input type="text" class="form-control" id="nome" name="nome" value="" required></input>
<div class="valid-feedback">
</div>
</div>
<div class="col-md-4">
<label for="validationCustom02" class="form-label">Email:</label>
<input type="text" class="form-control" id="email" name="email" value="" required></input>
</div>
</div>
<div class="col-md-4">
<label for="validationCustom02" class="form-label">Telefone:</label>
<input type="text" class="form-control" id="tel" name="telefone" value="" required></input>
</div>
<div class="col-md-3">
<label for="validationCustom05" class="form-label">CPF:</label>
<input type="text" class="form-control" id="cpf"name="cpf" required></input>
<div class="invalid-feedback">
Valide essa área .
</div>
</div>

<p>
<label for="nome" class="form-label">Data de Nascimento</label>
<input type="date" class="form-control" id="data"name="date" aria-describedby="nasc" required></input>
 </p>
<div class="col-12">
<div class="form-check">
<input class="form-check-input" type="checkbox" value="" id="invalidCheck" required></input>
<label class="form-check-label" for="invalidCheck">Afirmo que as informações são verdadeiras.</label>
<div class="feedback">
Você deve concordar antes de enviar.
</div>
</div>
</div>
<a href="faleconosco.jsp" div class="col-12 text-center">
<button class="btn btn-primary" type="submit">Cadastrar.</button>
</a>
</div>
</header>
</div>
  );
}


export default App;
