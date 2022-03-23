package binar.andlima.navigationcomponent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val datausername = arguments?.getString("USERNAME")
        val dataumur = arguments?.getString("UMUR")
        val dataganap = arguments?.getString("GANAP")

        untuk_semua.text = "$dataumur\n$datausername\n$dataganap"
//        untuk_umur.text = dataumur
//        untuk_ganap.text = dataganap

    }
}