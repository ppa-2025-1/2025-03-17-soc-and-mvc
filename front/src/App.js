import { BrowserRouter as Router, Route, Routes, Link } from "react-router-dom";
import DisciplinasLista from "./Pages//Disciplinas/Lista.js";
import './App.css';

function App() {
  return (
    <Router>
      <div className="App">

        <h1>Acadêmico</h1>

        <nav>
          <ul>
            <li>
              <Link to="/disciplinas">Disciplinas</Link>
            </li>
          </ul>
        </nav>

        <Routes>
          <Route path="/disciplinas" element={<DisciplinasLista />} />
        </Routes>

      </div>
    </Router>
  );
}

export default App;
