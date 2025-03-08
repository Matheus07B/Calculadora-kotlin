package com.main.mathcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.main.mathcalc.databinding.ActivityMainBinding

// Alterar visu
import android.view.View

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null

    private val binding: ActivityMainBinding
        get() = checkNotNull(_binding) { "Activity has been destroyed" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate and get instance of binding
        _binding = ActivityMainBinding.inflate(layoutInflater)

        // Set content view to binding's root
        setContentView(binding.root)
        
        /*
        if (binding.calculo.text.isNotEmpty()) {
            // Torna o 'resultado' visível
            binding.resultado.visibility = View.VISIBLE
        } else {
            // Oculta o 'resultado'
            binding.resultado.visibility = View.GONE
        }
        */

        // Numero de 0 a 9
        binding.numero0.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}0"
                    binding.resultado.text = "${binding.resultado.text}0"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "0"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                // nao retorna nada caso esteja vazio.
                // binding.layoutResultado.visibility = View.GONE
            }
        }
        binding.numero1.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}1"
                    binding.resultado.text = "${binding.resultado.text}1"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "1"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}1"
                binding.resultado.text = "= 1"
            }
        }
        binding.numero2.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}2"
                    binding.resultado.text = "${binding.resultado.text}2"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "2"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}2"
                binding.resultado.text = "= 2"
            }
        }
        binding.numero3.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}3"
                    binding.resultado.text = "${binding.resultado.text}3"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "3"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}3"
                binding.resultado.text = "= 3"
            }
        }
        binding.numero4.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}4"
                    binding.resultado.text = "= ${binding.resultado.text}4"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "4"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}4"
                binding.resultado.text = "= 4"
            }
        }
        binding.numero5.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}5"
                    binding.resultado.text = "${binding.resultado.text}5"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "5"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}5"
                binding.resultado.text = "= 5"
            }
        }
        binding.numero6.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}6"
                    binding.resultado.text = "${binding.resultado.text}6"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "6"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}6"
                binding.resultado.text = "= 6"
            }
        }
        binding.numero7.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}7"
                    binding.resultado.text = "${binding.resultado.text}7"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "7"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}7"
                binding.resultado.text = "= 7"
            }
        }
        binding.numero8.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}8"
                    binding.resultado.text = "${binding.resultado.text}8"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "8"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}8"
                binding.resultado.text = "= 8"
            }
        }
        binding.numero9.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.contains(",")) {
                    binding.calculo.text = "${binding.calculo.text}9"
                    binding.resultado.text = "${binding.resultado.text}9"
                } else {
                    val currentText = binding.calculo.text.toString().replace(".", "")
                    val newText = currentText + "9"
                    val formattedText = newText.reversed().chunked(3).joinToString(".").reversed()
                    binding.calculo.text = formattedText
                    binding.resultado.text = "= $formattedText"
                    // binding.layoutResultado.visibility = View.VISIBLE
                }    
            } else {
                binding.calculo.text = "${binding.calculo.text}9"
                binding.resultado.text = "= 9"
            }
        }
        
        // Operadores
        binding.operadorSoma.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.last() == '+' || binding.calculo.text.last() == '-' || binding.calculo.text.last() == '*' || binding.calculo.text.last() == '/') {
                    
                } else {
                    binding.calculo.text = "${binding.calculo.text}+"
                }    
            } else {
            
            }
        }
        binding.operadorSub.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.last() == '+' || binding.calculo.text.last() == '-' || binding.calculo.text.last() == '*' || binding.calculo.text.last() == '/') {
                    
                } else {
                    binding.calculo.text = "${binding.calculo.text}-"
                }    
            } else {
            
            }
        }
        binding.operadorMul.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.last() == '+' || binding.calculo.text.last() == '-' || binding.calculo.text.last() == '*' || binding.calculo.text.last() == '/') {
                    
                } else {
                    binding.calculo.text = "${binding.calculo.text}*"
                }    
            } else {
            
            }
        }
        binding.operadorDiv.setOnClickListener {
            if (binding.calculo.text.isNotEmpty()) {
                if (binding.calculo.text.last() == '+' || binding.calculo.text.last() == '-' || binding.calculo.text.last() == '*' || binding.calculo.text.last() == '/') {
                    
                } else {
                    binding.calculo.text = "${binding.calculo.text}/"
                }    
            } else {
            
            }
        }
        
        // float
        binding.pontoFloat.setOnClickListener {
            if (binding.calculo.text.contains(",")) {
                
            } else {
                if (binding.calculo.text.isNotEmpty()) {
                    binding.calculo.text = "${binding.calculo.text},"
                    binding.resultado.text = "= ${binding.calculo.text}"
                } else {
                    binding.calculo.text = "${binding.calculo.text}0,"
                    binding.resultado.text = "= ${binding.calculo.text}"
                }
            }    
        }
        
        // Outros
        binding.limparUmSo.setOnClickListener {
            binding.calculo.text = binding.calculo.text.dropLast(1)
            binding.resultado.text = binding.resultado.text.dropLast(1)
            if (binding.calculo.text.isNotEmpty()) {
                
            } else {
                binding.resultado.text = "0"
            }
        }
        binding.limpar.setOnClickListener {
            binding.calculo.text = ""
            binding.resultado.text = "0"
        }
        
        
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}