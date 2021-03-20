class Principal
{
    public static void main(String args [])
    {
        Curso c = new Curso();
        c.lerDados();
        Professor p = new Professor();
        p.lerDados();
        Disciplina d = new Disciplina(p,c);
        d.lerDados();
        Aluno a = new Aluno();
        a.lerDados();
        AlunoPosGraduacao ap = new AlunoPosGraduacao(c);
        ap.lerDados();
        Tecnicos t = new Tecnicos();
        t.lerDados();
        c.mostraDados();
        p.mostraDados();
        d.mostraDados();
        a.mostraDados();
        ap.mostraDados();
        t.mostraDados();
    }
}