package OOP

abstract class TaiKhoan {
    protected var soDu: Double = 0.0
    var soTaiKhoan: String = ""
    var name: String = ""

    abstract fun napTien(soTien: Double)
    abstract fun rutTien(soTien: Double)

    fun xemSoDu(): Double {
        return soDu
    }
}

class taiKhoanTietKiem : TaiKhoan() {
    private val laiSuat = 0.5

    override fun napTien(soTien: Double) {
        if (soTien > 0) {
            val tienCongThem = soTien * laiSuat
            soDu += soTien + tienCongThem
        }
    }

    override fun rutTien(soTien: Double) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien
        }
    }
}

fun main() {
    val taiKhoan = taiKhoanTietKiem()  // Khởi tạo đối tượng
    taiKhoan.soTaiKhoan = "12345678"
    taiKhoan.name = "Nguyen Van A"

    taiKhoan.napTien(150000.0)
    println("Số dư hiện tại: ${taiKhoan.xemSoDu()}")
}
