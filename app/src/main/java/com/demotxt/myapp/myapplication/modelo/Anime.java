package com.demotxt.myapp.myapplication.modelo;

public class Anime {

    private String nome;
    private String descricao;
    private String nota;
    private int n_episodio;
    private String categoria;
    private String estudio;
    private String imagem_url;

    public Anime() {
    }

    public Anime(String nome, String descricao, String nota, int n_episodio, String categoria, String estudio, String imagem_url) {
        this.nome = nome;
        this.descricao = descricao;
        this.nota = nota;
        this.n_episodio = n_episodio;
        this.categoria = categoria;
        this.estudio = estudio;
        this.imagem_url = imagem_url;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNota() {
        return nota;
    }

    public int getN_episodio() {
        return n_episodio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEstudio() {
        return estudio;
    }

    public String getImagem_url() {
        return imagem_url;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void setN_episodio(int n_episodio) {
        this.n_episodio = n_episodio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void setImagem_url(String imagem_url) {
        this.imagem_url = imagem_url;
    }
}
