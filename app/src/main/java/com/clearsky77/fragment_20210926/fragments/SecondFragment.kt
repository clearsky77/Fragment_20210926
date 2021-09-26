package com.clearsky77.fragment_20210926.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.clearsky77.fragment_20210926.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toastBtn.setOnClickListener {
//            토스트를 불러내는 화면은 this로 하면 fragment라서 에러가 난다.
            Toast.makeText(requireContext(), "프래그먼트 토스트", Toast.LENGTH_SHORT).show()
        }
    }


}