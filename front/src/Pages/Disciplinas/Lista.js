import { useEffect, useState } from "react";

const Disciplinas = () => {
  const [disciplinas, setDisciplinas] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch("http://localhost:8080/api/disciplinas")
      .then((response) => {
        if (!response.ok) {
          throw new Error("Falhou ao carregar " + response.status);
        }
        return response.json();
      })
      .then((data) => {
        setDisciplinas(data);
        setLoading(false);
      })
      .catch((err) => {
        setError(err.message);
        setLoading(false);
      });
  }, []);

  if (loading) return <p>Carregando ...</p>;
  if (error) return <p>Erro: {error}</p>;

  return (
    <div>
      <h2>Lista de Disciplinas</h2>
      <table border="1" cellPadding="5" cellSpacing="0">
        <thead>
          <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>Carga Horária</th>
          </tr>
        </thead>
        <tbody>
          {disciplinas.map((disciplina) => (
            <tr key={disciplina.id}>
              <td>{disciplina.codigo}</td>
              <td>{disciplina.nome}</td>
              <td>{disciplina.cargaHoraria}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};


const DisciplinasLista = () => {
    return (
      <div>
        <h1>Disciplinas</h1>
        <Disciplinas />
      </div>
    );
  };
  
 export default DisciplinasLista;
  