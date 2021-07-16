package co.com.client.project.model.dto;

//Ejemplo de enumerador

//TODO mofidicar o eliminar clase de no ser usada
public enum TipoId {
    CC("Cédula de ciudadanía", "COLOMBIANA", "1"),
    PAS("Pasaporte", "EXTRANJERA", "10671");

    private String descripcion;
    private String nacionalidad;
    private String dataValue;

    TipoId(String descripcion, String nacionalidad, String dataValue) {
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.dataValue = dataValue;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDataValue() {
        return dataValue;
    }
}
