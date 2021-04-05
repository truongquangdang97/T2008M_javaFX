package newTest;

public class Nguoi {
    String ten;
    Integer chieucao;
    Integer cannang;

    public Nguoi(String ten, Integer chieucao, Integer cannang) {
        this.ten = ten;
        this.chieucao = chieucao;
        this.cannang = cannang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getChieucao() {
        return chieucao;
    }

    public void setChieucao(Integer chieucao) {
        this.chieucao = chieucao;
    }

    public Integer getCannang() {
        return cannang;
    }

    public void setCannang(Integer cannang) {
        this.cannang = cannang;
    }
}
