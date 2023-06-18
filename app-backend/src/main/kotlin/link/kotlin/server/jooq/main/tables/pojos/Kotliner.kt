/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Kotliner(
    var id: Long? = null,
    var avatar: String? = null,
    var description: String? = null,
    var normalizedEmail: String? = null,
    var originalEmail: String? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var nickname: String? = null,
    var password: String? = null,
    var totp: String? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: Kotliner = other as Kotliner
        if (this.id === null) {
            if (o.id !== null)
                return false
        }
        else if (this.id != o.id)
            return false
        if (this.avatar === null) {
            if (o.avatar !== null)
                return false
        }
        else if (this.avatar != o.avatar)
            return false
        if (this.description === null) {
            if (o.description !== null)
                return false
        }
        else if (this.description != o.description)
            return false
        if (this.normalizedEmail === null) {
            if (o.normalizedEmail !== null)
                return false
        }
        else if (this.normalizedEmail != o.normalizedEmail)
            return false
        if (this.originalEmail === null) {
            if (o.originalEmail !== null)
                return false
        }
        else if (this.originalEmail != o.originalEmail)
            return false
        if (this.firstName === null) {
            if (o.firstName !== null)
                return false
        }
        else if (this.firstName != o.firstName)
            return false
        if (this.lastName === null) {
            if (o.lastName !== null)
                return false
        }
        else if (this.lastName != o.lastName)
            return false
        if (this.nickname === null) {
            if (o.nickname !== null)
                return false
        }
        else if (this.nickname != o.nickname)
            return false
        if (this.password === null) {
            if (o.password !== null)
                return false
        }
        else if (this.password != o.password)
            return false
        if (this.totp === null) {
            if (o.totp !== null)
                return false
        }
        else if (this.totp != o.totp)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.id === null) 0 else this.id.hashCode())
        result = prime * result + (if (this.avatar === null) 0 else this.avatar.hashCode())
        result = prime * result + (if (this.description === null) 0 else this.description.hashCode())
        result = prime * result + (if (this.normalizedEmail === null) 0 else this.normalizedEmail.hashCode())
        result = prime * result + (if (this.originalEmail === null) 0 else this.originalEmail.hashCode())
        result = prime * result + (if (this.firstName === null) 0 else this.firstName.hashCode())
        result = prime * result + (if (this.lastName === null) 0 else this.lastName.hashCode())
        result = prime * result + (if (this.nickname === null) 0 else this.nickname.hashCode())
        result = prime * result + (if (this.password === null) 0 else this.password.hashCode())
        result = prime * result + (if (this.totp === null) 0 else this.totp.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Kotliner (")

        sb.append(id)
        sb.append(", ").append(avatar)
        sb.append(", ").append(description)
        sb.append(", ").append(normalizedEmail)
        sb.append(", ").append(originalEmail)
        sb.append(", ").append(firstName)
        sb.append(", ").append(lastName)
        sb.append(", ").append(nickname)
        sb.append(", ").append(password)
        sb.append(", ").append(totp)

        sb.append(")")
        return sb.toString()
    }
}