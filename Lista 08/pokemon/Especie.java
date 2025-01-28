package pokemon;

import java.util.Arrays;

public class Especie {
    private String nome;
    private short healthPoints;
    private short pokedexNumber;
    private short attack;
    private short defense;
    private short speed;
    private short special;
    private Status estado;
    private Tipo tipoPrimario;
    private Tipo tipoSecundario;
    private Move[] movimentos;

    public Especie(short attack, short defense, Status estado, short healthPoints, Move[] movimentos, String nome, short pokedexNumber, short special, short speed, Tipo tipoPrimario, Tipo tipoSecundario) {
        this.attack = attack;
        this.defense = defense;
        this.estado = estado;
        this.healthPoints = healthPoints;
        this.movimentos = movimentos;
        this.nome = nome;
        this.pokedexNumber = pokedexNumber;
        this.special = special;
        this.speed = speed;
        this.tipoPrimario = tipoPrimario;
        this.tipoSecundario = tipoSecundario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(short healthPoints) {
        this.healthPoints = healthPoints;
    }

    public short getPokedexNumber() {
        return pokedexNumber;
    }

    public void setPokedexNumber(short pokedexNumber) {
        this.pokedexNumber = pokedexNumber;
    }

    public short getAttack() {
        return attack;
    }

    public void setAttack(short attack) {
        this.attack = attack;
    }

    public short getDefense() {
        return defense;
    }

    public void setDefense(short defense) {
        this.defense = defense;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getSpecial() {
        return special;
    }

    public void setSpecial(short special) {
        this.special = special;
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public Tipo getTipoPrimario() {
        return tipoPrimario;
    }

    public void setTipoPrimario(Tipo tipoPrimario) {
        this.tipoPrimario = tipoPrimario;
    }

    public Tipo getTipoSecundario() {
        return tipoSecundario;
    }

    public void setTipoSecundario(Tipo tipoSecundario) {
        this.tipoSecundario = tipoSecundario;
    }

    public Move[] getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(Move[] movimentos) {
        this.movimentos = movimentos;
    }

//    @Override
//    public String toString() {
//        return "Especie{" +
//                "nome='" + nome + '\'' +
//                ", healthPoints=" + healthPoints +
//                ", pokedexNumber=" + pokedexNumber +
//                ", attack=" + attack +
//                ", defense=" + defense +
//                ", speed=" + speed +
//                ", special=" + special +
//                ", estado=" + estado +
//                ", tipoPrimario=" + tipoPrimario +
//                ", tipoSecundario=" + tipoSecundario +
//                ", movimentos=" + Arrays.toString(movimentos) +
//                '}';
//    }
    public String toString() {
        return String.format("Pokémon: %s #%03d\nTipos: %s/%s\nHP: %s\nStatus: %s\nAtaque: %s | Defesa: %s\nVelocidade: %s\nEspecial: %s\nMovimento 01: %s\nMovimento 02: %s\nMovimento 03: %s",
                getNome(),
                getPokedexNumber(),
                getTipoPrimario(),
                getTipoSecundario(),
                getHealthPoints(),
                getEstado(),
                getAttack(),
                getDefense(),
                getSpeed(),
                getSpecial(),
                getMovimentos()[0],
                getMovimentos()[1],
                getMovimentos()[2]);
    }
}
