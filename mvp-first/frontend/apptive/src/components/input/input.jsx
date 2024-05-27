import "./input.css";

function Input({ placeholder, value, onChange }) {
  return (
    <input
      type="text"
      className="input"
      value={value}
      onChange={onChange}
      placeholder={placeholder}
    />
  );
}

export default Input;
