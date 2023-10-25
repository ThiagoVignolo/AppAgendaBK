package es.ieslosmontecillos.AppAgendaBK.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;
import java.util.Collection;
import java.util.Objects;
@Entity
@Table(name="PERSONA")
public class Persona implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;
    @Basic
    @Column(name = "APELLIDOS", nullable = false, length = 40)
    private String apellidos;
    @Basic
    @Column(name = "TELEFONO", nullable = true, length = 15)
    private String telefono;
    @Basic
    @Column(name = "EMAIL", nullable = true, length = 30)
    private String email;
    @ManyToOne
    @JoinColumn(name = "PROVINCIA", nullable = false)
    private Provincia provincia;
    @Basic
    @Column(name = "FECHA_NACIMIENTO", nullable = true)
    private Date fecha_nacimiento;
    @Basic
    @Column(name = "NUM_HIJOS", nullable = true)
    private short num_hijos;
    @Basic
    @Column(name = "ESTADO_CIVIL", nullable = true, length = 1)
    private String estado_civil;
    @Basic
    @Column(name = "SALARIO", nullable = true, precision = 9, scale = 2)
    private BigDecimal salario;
    @Basic
    @Column(name = "JUBILADO", nullable = true)
    private short jubilado;
    @Basic
    @Column(name = "FOTO", nullable = true, length = 30)
    private String foto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public short getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(short num_hijos) {
        this.num_hijos = num_hijos;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public short getJubilado() {
        return jubilado;
    }

    public void setJubilado(short jubilado) {
        this.jubilado = jubilado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return getNum_hijos() == persona.getNum_hijos() && getJubilado() == persona.getJubilado() && Objects.equals(getId(), persona.getId()) && Objects.equals(getNombre(), persona.getNombre()) && Objects.equals(getApellidos(), persona.getApellidos()) && Objects.equals(getTelefono(), persona.getTelefono()) && Objects.equals(getEmail(), persona.getEmail()) && Objects.equals(getProvincia(), persona.getProvincia()) && Objects.equals(getFecha_nacimiento(), persona.getFecha_nacimiento()) && Objects.equals(getEstado_civil(), persona.getEstado_civil()) && Objects.equals(getSalario(), persona.getSalario()) && Objects.equals(getFoto(), persona.getFoto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellidos(), getTelefono(), getEmail(), getProvincia(), getFecha_nacimiento(), getNum_hijos(), getEstado_civil(), getSalario(), getJubilado(), getFoto());
    }
}

