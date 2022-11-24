package co.com.inspirar.modelo;

public class Consulta {
	private int idUsuario = 0;
    private int idConsultante = 0;
    private String fecha = "";
    private String motivo = "";
    private String hProbremaActual = "";
    private String antecedentesCliPat = "";
    private String antecedentesCliNoPat = "";
    private String genograma = "";
    private String planTerapeutico = "";
    private String notas = "";
    private String examenMentIni = "";
    private String historiaFamiliar = "";

    public Consulta() {
    }

    public Consulta(int idUsuario, int idConsultante, String fecha, String motivo, 
            String hProbremaActual, String antecedentesCliPat, String antecedentesCliNoPat, 
            String genograma, String planTerapeutico, String notas, String examenMentIni, String historiaFamiliar) {
        this.idUsuario = idUsuario;
        this.idConsultante = idConsultante;
        this.fecha = fecha;
        this.motivo = motivo;
        this.hProbremaActual = hProbremaActual;
        this.antecedentesCliPat = antecedentesCliPat;
        this.antecedentesCliNoPat = antecedentesCliNoPat;
        this.genograma = genograma;
        this.planTerapeutico = planTerapeutico;
        this.notas = notas;
        this.examenMentIni = examenMentIni;
        this.historiaFamiliar = historiaFamiliar;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdConsultante() {
        return idConsultante;
    }

    public void setIdConsultante(int idConsultante) {
        this.idConsultante = idConsultante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String gethProbremaActual() {
        return hProbremaActual;
    }

    public void sethProbremaActual(String hProbremaActual) {
        this.hProbremaActual = hProbremaActual;
    }

    public String getAntecedentesCliPat() {
        return antecedentesCliPat;
    }

    public void setAntecedentesCliPat(String antecedentesCliPat) {
        this.antecedentesCliPat = antecedentesCliPat;
    }

    public String getAntecedentesCliNoPat() {
        return antecedentesCliNoPat;
    }

    public void setAntecedentesCliNoPat(String antecedentesCliNoPat) {
        this.antecedentesCliNoPat = antecedentesCliNoPat;
    }

    public String getGenograma() {
        return genograma;
    }

    public void setGenograma(String genograma) {
        this.genograma = genograma;
    }

    public String getPlanTerapeutico() {
        return planTerapeutico;
    }

    public void setPlanTerapeutico(String planTerapeutico) {
        this.planTerapeutico = planTerapeutico;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getExamenMentIni() {
        return examenMentIni;
    }

    public void setExamenMentIni(String examenMentIni) {
        this.examenMentIni = examenMentIni;
    }

    public String getHistoriaFamiliar() {
        return historiaFamiliar;
    }

    public void setHistoriaFamiliar(String historiaFamiliar) {
        this.historiaFamiliar = historiaFamiliar;
    }
}
