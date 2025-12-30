
import React from "react";
import '../Login.css'; // Importamos el CSS

function Login() {
  return (
    <div className="login-container">
      <h2 className="login-title">Iniciar Sesión</h2>
      <form className="login-form">
        <input
          className="login-input"
          type="text"
          placeholder="Usuario"
        />
        <input
          className="login-input"
          type="password"
          placeholder="Contraseña"
        />
        <button className="login-button">Entrar</button>
      </form>
    </div>
  );
}

export default Login;
