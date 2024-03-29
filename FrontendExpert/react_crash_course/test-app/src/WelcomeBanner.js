import { useContext } from 'react';
import { UserContext } from './UserContext';

export default function WelcomeBanner() {
    const { user } = useContext(UserContext);
    return <h1>Hello {user.name}</h1>
}