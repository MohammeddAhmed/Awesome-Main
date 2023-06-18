/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.pojos


import java.io.Serializable
import java.time.LocalDate


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class KotlinerKug(
    var kotlinerId: Long? = null,
    var kugId: Long? = null,
    var joinDate: LocalDate? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other === null)
            return false
        if (this::class != other::class)
            return false
        val o: KotlinerKug = other as KotlinerKug
        if (this.kotlinerId === null) {
            if (o.kotlinerId !== null)
                return false
        }
        else if (this.kotlinerId != o.kotlinerId)
            return false
        if (this.kugId === null) {
            if (o.kugId !== null)
                return false
        }
        else if (this.kugId != o.kugId)
            return false
        if (this.joinDate === null) {
            if (o.joinDate !== null)
                return false
        }
        else if (this.joinDate != o.joinDate)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.kotlinerId === null) 0 else this.kotlinerId.hashCode())
        result = prime * result + (if (this.kugId === null) 0 else this.kugId.hashCode())
        result = prime * result + (if (this.joinDate === null) 0 else this.joinDate.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("KotlinerKug (")

        sb.append(kotlinerId)
        sb.append(", ").append(kugId)
        sb.append(", ").append(joinDate)

        sb.append(")")
        return sb.toString()
    }
}
