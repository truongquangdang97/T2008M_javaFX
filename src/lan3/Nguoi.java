package lan3;

public class Nguoi {
    String ten;
    Integer chieucao;
    Double cannang;

    public Nguoi(String ten, Integer chieucao, Double cannang) {
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

    public Double getCannang() {
        return cannang;
    }

    public void setCannang(Double cannang) {
        this.cannang = cannang;
    }
}
